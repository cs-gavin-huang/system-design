Dog dog; //定义父类引用
dog = new Dog();//父类引用指向父类对象（狗是犬类）
dog = new Husky()//父类引用指向子类对象（哈士奇是犬类）

Husky husky = new Dog();//错误：子类引用指向父类对象（犬类是哈士奇）