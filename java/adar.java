public class adar {
    class A {
        private final int id;
        private final String name;
        private String comments;
        public A(int id, String name, String comments) {
            this.id = id;			// statement 1
            this.name = name;		// statement 2
            this.comments = comments;	// statement 3
        }
        public void setComments(String comments) {
            this.comments = comments;	// statement 4
        }
    }
    public class TestA {
        public static void main(String[] args) {
            A a1 = new A(3, "Car", "Red Car");
            final A a2 = new A(4, "Jeep", "Green Jeep");
            a2.setComments("Black Jeep");	// statement 5
            a2 = a1;			// statement 6
        }
    }
}
