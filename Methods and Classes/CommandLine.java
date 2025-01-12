class CommandLine {
    public static void main(String[] args) {
        System.out.println("Length of the args array:" + args.length);
        for(int i=0; i<args.length; i++) {
            System.out.println("args[" +i+ "]: "+ args[i]);
        }
    }
}