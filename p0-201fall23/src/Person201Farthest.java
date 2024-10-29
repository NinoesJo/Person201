public class Person201Farthest {
    public static void main(String[] args) throws Exception {
        String file = "data/large.txt";
        double max = 0;
        Person201 a = null;
        Person201 b = null;
        Person201[] people = Person201Utilities.readFile(file);
        for (int i = 0; i < people.length-1; i++) {
            for (int j = 1; j < people.length; j++) {
                double distance = people[i].distanceFrom(people[j]);
                if (distance > max) {
                    a = people[i];
                    b = people[j];
                    max = distance;
                }
            }
        }
        System.out.printf("farthest distance is %3.2f between %s and %s\n", max, a.getName(), b.getName());
    }
}