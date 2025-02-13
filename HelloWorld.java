class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        
        Runtime runtime = Runtime.getRuntime();
        System.out.printf("free memory for JVM %d (MB) \n", runtime.freeMemory() / (1024 * 1024) );
    }
}