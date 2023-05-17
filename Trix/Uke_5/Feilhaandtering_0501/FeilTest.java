class FeilTest {
    public static void main(String[] args) {

        //Oppretter en array med noen strenger
        String[] tallstrenger = {"10", "1", "32", "hei", "14", "11"};


        //Forsoeker aa konvertere alle strengene til heltall og skrive ut
        for (int i = 0; i < tallstrenger.length; i++) {
            if (stringToIntError(tallstrenger[i])) {
                int tmp = Integer.parseInt(tallstrenger[i]);
                System.out.println("Tallet er: " + tmp);
            }
        }
    }

    public static boolean stringToIntError(String string) {
        try {
            int integer = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println("Feil i konvertering av string til heltall. " + e.getMessage());
            return false;
        }
        return true;
    }
}

/*
 * 
 */