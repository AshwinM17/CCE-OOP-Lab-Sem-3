class swap {
    int number;

    swap(int n) {
        number = n;
    }
}

class byRefrence {
    static void swapping(swap numobj1, swap numobj2) {
        int temp = numobj1.number;
        numobj1.number = numobj2.number;
        numobj2.number = temp;
    }
    public static void main(String[] args) {
        swap num1 = new swap(5);
        swap num2 = new swap(10);

        System.out.println("Before swapping: " + num1.number + " " + num2.number);
        swapping(num1, num2);
        System.out.println("After swapping: " + num1.number + " " + num2.number);
    }
}