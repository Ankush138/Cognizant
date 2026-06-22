class test{
    public static void main(String[] args){
        Logger obj=Logger.getInstance();
        Logger obj1=Logger.getInstance();

        System.out.println(obj == obj1);
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
    }
}


 class Logger {
    public static Logger obj;
    private Logger(){
        System.out.println("Logged succesfully");
    }
    public static Logger getInstance(){
        if(obj==null){
            synchronized (Logger.class){
                if(obj==null)   obj=new Logger();
            }
        }
        return obj;
    }
}



