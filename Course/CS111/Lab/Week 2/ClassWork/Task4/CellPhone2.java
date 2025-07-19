public class CellPhone {
    public String model = "Unknown";
    // public int contactStored = 0;
    public String contact[] = new String[10];
    public int i = 0;

    public void storeContact(String name) {

        contact[i] = name;
        i++;

        if (i > 3) {
            System.out.println("Memory full. New contacts can't be stored");
            i--;
        } else {
            System.out.println("Contact stored");
        }
    }

    public void printDetails() {
        System.out.println("Phone Model: " + model);
        System.out.println("Contacts stored: " + i);
        for (int j = 0; j < i; j++) {
            System.out.println(contact[j]);
        }

    }

}