import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.HashMap;

public class Hovedprogram {
    public static void main(String[] args) {

        /*
         * Lager et verden objekt, og et hashmap som skal
         * brukes til å koble sammen knapper med cellen den representerer.
         */
        Verden verden = new Verden(8, 12);
        HashMap<Celle, JButton> knapper = new HashMap<Celle, JButton>();

        try{
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {System.exit(1);}
        JFrame vindu = new JFrame("Game of Life");
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Lager panelene som programmet skal bestå av.
        JPanel hovedPanel = new JPanel();
        JPanel startAvsluttPanel = new JPanel();
        JPanel spillPanel = new JPanel(new GridLayout(0, 12));
        hovedPanel.setLayout(new BorderLayout());
        hovedPanel.add(startAvsluttPanel, BorderLayout.NORTH);
        hovedPanel.add(spillPanel, BorderLayout.SOUTH);
        vindu.add(hovedPanel);

        JLabel generasjonOversikt = new JLabel("Generasjon: " + verden.genNr + " ");
        JButton startKnapp = new JButton("Start");

        // Når bruker trykker på start, skal programmet begynne å oppdatere verdenen.
        // hvert 2. sekund.
        class Starter implements ActionListener {
            public Timer timer;

            public Starter() {
                timer = new Timer(2000, this);
            }

            public void actionPerformed(ActionEvent e) {
                timer.start();  
                verden.oppdatering();
                generasjonOversikt.setText("Generasjon: " + verden.genNr + " ");
                for (Celle celle : knapper.keySet()) {
                    knapper.get(celle).setText(String.valueOf(celle.hentStatusTegn()));
                }
            }
        }
        startKnapp.addActionListener(new Starter());

        // sluttKnapp som avslutter programmet om den blir trykket på.
        JButton sluttKnapp = new JButton("Exit");
        class Stopper implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }
        sluttKnapp.addActionListener(new Stopper());

        // Legger til generasjonOversikten, start- og slutt-knappene.
        startAvsluttPanel.add(generasjonOversikt);
        startAvsluttPanel.add(startKnapp);
        startAvsluttPanel.add(sluttKnapp);

        // Lager klassen CelleKnapp som endrer cellen den er knyttet til
        // sin status til enten levende eller død basert på tidligere status.
        class CelleKnapp implements ActionListener {
            Celle celle;
            JButton button;

            public CelleKnapp(int rad, int kol, JButton button) {
                celle = verden.rutenett.hentCelle(rad, kol);
                this.button = button;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if (celle.erLevende()) {
                    celle.settDoed();
                    button.setText(String.valueOf(celle.hentStatusTegn()));
                }
                else {
                    celle.settLevende();
                    button.setText(String.valueOf(celle.hentStatusTegn()));
                }
            }
        }

        // Fyller inn spillPanel-griddet med knapper, og knytter sammen knappene med cellen den hører til.
        for (int rad = 0; rad < verden.rutenett.antRader; rad++) {
            for (int kol = 0; kol < verden.rutenett.antKolonner; kol++) {
                JButton nyknapp = new JButton(String.valueOf(verden.rutenett.hentCelle(rad, kol).hentStatusTegn()));
                nyknapp.addActionListener(new CelleKnapp(rad, kol, nyknapp));
                knapper.put(verden.rutenett.hentCelle(rad, kol), nyknapp);
                spillPanel.add(nyknapp);
            }
        }
        

        vindu.pack(); vindu.setLocationRelativeTo(null);
        vindu.setVisible(true);
    }
}