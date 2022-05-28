public class Dog {
    protected String breeds;//品种
    protected boolean sex;//性别
    protected String color;//毛色
    protected int age;//年龄
    public Dog(String breeds) { 
        this.age = 0; //初始化为0岁
        this.breeds = breeds; //初始化犬类品种
    }

    public void bark(){//吠叫
    System.out.println("汪汪汪");
    }

    public String getBreeds() {
    return breeds;
    }

    /*假设自出生后就不可以变种了，那么此处不应暴露setBreeds方法
        public void setBreeds(String breeds) {
        this.breeds = breeds;
        }
    */
    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}