package EmploeeControler;


import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception {
        boolean Join=false;
        Date date =new Date();
        String u;
        String p;
        int i = 0 ;
        Join join = new Join();
        join.user.add("Melika");
        join.user.add("Mania");
        join.user.add("Mona");
        join.pass.add("123456789");
        join.pass.add("106105");
        join.pass.add("16213");
        System.out.println("آیا قبلا ثبت نام کرده اید؟(Y or N) ");
        Scanner scanner = new Scanner(System.in);
        String m = scanner.next();

        if (m.equalsIgnoreCase("y")) {

            System.out.println("لطفا نام کاربری خود را وارد کنید .");

                      Scanner scanner1 = new Scanner(System.in);
                       u  =scanner1.next();
            while (join.userCheck(u)!=true) {
                System.err.println("نام کاربری صحیح نمی باشد.");
                Scanner scanner4 = new Scanner(System.in);
                 u =scanner4.next();

            }

            System.out.println("لطفا رمز عبور خود را وارد کنید.");
            Scanner scanner2 = new Scanner(System.in);
             p = scanner2.next();
            while (join.passCheck(p)!=true) {
                System.out.println("رمز عبور صحیح نمی باشد.");
                Scanner scanner5 = new Scanner(System.in);
                p=scanner5.next();

            }
            Join=true;
        } else if (m.equalsIgnoreCase("n")) {
            System.out.println("لطفا نام کاربری مورد نظر را وارد کنید.");
            Scanner scanner1 = new Scanner(System.in);
            u=scanner1.next();

            while (join.user.contains(u)==true) {
                System.err.println("این نام کاربری قبلا وجود داشته است.");
                Scanner scanner2 = new Scanner(System.in);
                u=scanner2.next();
            }
            join.userN(u);
            System.out.println("لطفا رمز مورد نظر خود را وارد کنید");
            Scanner scanner2 = new Scanner(System.in);
            p = scanner2.next();
            join.passW(p);
            System.out.println("عملیات با موفقیت انجام شد لطفا دوباره وارد شوید");
            System.out.println("لطفا نام کاربری خود را وارد کنید .");

            Scanner Scanner1 = new Scanner(System.in);
            u  =Scanner1.next();
            while (join.userCheck(u)!=true) {
                System.err.println("نام کاربری صحیح نمی باشد.");
                Scanner scanner4 = new Scanner(System.in);
                u =scanner4.next();

            }

            System.out.println("لطفا رمز عبور خود را وارد کنید.");
            Scanner Scanner2 = new Scanner(System.in);
            p = Scanner2.next();
            while (join.passCheck(p)!=true) {
                System.out.println("رمز عبور صحیح نمی باشد.");
                Scanner scanner5 = new Scanner(System.in);
                p=scanner5.next();

                }
                Join=true;

            }


            if (Join=true){


                    long startTime = System.currentTimeMillis();


                    System.out.println(date.toString());
                while (true) {
                    System.out.println("در صورت درخواست برای رزرو غذا عدد 1 و در صورت درخواست برای مرخصی عدد 2 را و در صورت خروج عدد 3 را وارد کنید");

                    Scanner scanner1 = new Scanner(System.in);
                    int n = Integer.parseInt(scanner1.next());
                    switch (n) {
                        case 1:
                            Food food = new Food();
                            System.out.println("در صورت رزرو ناهار عدد 1 ودر صورت رزرو شام عدد 2 را وارد کنید.");
                            Scanner scanner2 = new Scanner(System.in);
                            int R = Integer.parseInt(scanner2.next());
                            switch (R) {
                                case 1:
                                    System.out.println("1.قیمه 2.جوجه 3.کوبیده 4.عدس پلو ");
                                    Scanner scanner3 = new Scanner(System.in);
                                    int l = Integer.parseInt(scanner3.next());
                                    food.lunch(l);
                                    break;
                                case 2:
                                    System.out.println("1.شنیسل مرغ 2.سالاد الویه3. خوراک کتلت4. خوراک مرغ و قارچ");
                                    Scanner scanner4 = new Scanner(System.in);
                                    int d = Integer.parseInt(scanner4.next());
                                    food.dinner(d);
                            }

                            break;
                        case 2:
                            i++;
                            Leave leave = new Leave();
                            leave.Leave(i);
                            break;
                        default:


                            long finishTime = System.currentTimeMillis();

                            System.out.println(Time.Time(finishTime - startTime));
                            System.exit(1);
                    }


                }
            }
        }
}