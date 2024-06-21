//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       SalariedEmployee aaa = new SalariedEmployee("aaa","001");
       HourlyEmployee bbb = new HourlyEmployee("bbb","002");
       aaa.setAnnualSalary(600000);
       bbb.setHourlyWage(183);
       aaa.calculateSalary();
       bbb.calculateSalary();
       aaa.show();
       System.out.println();
       bbb.show();
       System.out.println();
       System.out.println("兩位員工月薪是否相等:"+aaa.equalsSalary(bbb));


    }
}