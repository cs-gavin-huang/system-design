public class EnemyPlane implements Cloneable{
    private Bullet bullet;
    private int x;//敌机横坐标
    private int y = //敌机纵坐标

    public EnemyPlane(int x) {//构造器
        this.x = x;
    }

   public int getX() {
       return x;
   }

   public int getY() {
       return y;
   }

   public void fly(){//让敌机飞
       y++;//每调用一次，敌机飞行时纵坐标＋1
   }

   //此处开放setX，是为了让克隆后的实例重新修改横坐标
   public void setX(int x) {
       this.x = x;
       this.bullet = bullet;
   }

   //重写克隆方法
   @Override
   public EnemyPlane clone() throws CloneNotSupportedException {
        EnemyPlane clonePlane = (EnemyPlane) super.clone();//克隆出敌机
        clonePlane.setBullet(this.bullet.clone());//对子弹进行深拷贝
        return clonePlane;
   }

}