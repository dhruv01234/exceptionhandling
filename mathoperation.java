class mathoperation {
    public static void main(String[] args) {
        int sum = 0;
        float avg;
        int a[] = new int[args.length];
        try {
            for (int i = 0; i < args.length; i++) {
                a[i] = Integer.parseInt(args[i]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        for (int i = 0; i < args.length; i++) {
            sum += a[i];
        }
        avg = sum/args.length;
        System.out.println("sum = "+sum+"\n"+"avg = "+avg);
    }
}
