package EmploeeControler;

public class Leave {


    public void Leave (int i) {
        if (i < 3) {
            System.out.println("مرخصی شما ثبت شد ");
            int m = 3 - i;
            System.out.println("تعداد مرخصی باقی مانده:");
            System.out.println(m);


        } else
            System.out.println("تعداد درخواست مرخصی بیشتراز حد مجازاست");


    }

}
