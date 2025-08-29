public class WrapperClas {

    public static void main(String[] args) {
        int i = 10;

        Integer j = Integer.valueOf(i);
        System.out.println(j);
        String s = "30";
        int n = Integer.parseInt(s);
        System.out.println(n);

        int m = Integer.valueOf(s);
        System.out.println(m);

    }
}
