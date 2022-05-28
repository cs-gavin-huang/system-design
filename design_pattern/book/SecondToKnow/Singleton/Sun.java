//饿汉
public class Sun {

   private static final Sun sun = new Sun();//自有永有的太阳单例

   private Sun(){//构造方法私有化
   
   }

   public static Sun getInstance(){//阳光普照，方法公开化
      return sun;
  }

}

//lazy load
public class Sun {

    private volatile static Sun sun;

    private Sun(){//构造方法私有化
    
    } 

    public static Sun getInstance() {//华山入口
       if (sun == null) {//观日台入口
           synchronized(Sun.class){//观日者进行排队
              if (sun == null) {
                  sun = new Sun();//只有排头兵造了太阳，旭日东升
              }
           }
       }
       return sun; //……阳光普照，其余人不必再造日
   }
}