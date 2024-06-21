public class TempertureConverter {



     double convertToC(double f) {

        double F=(f-32)*5/9;
        return F;

    }


     double convertToF(double c){
     double C=(c*9/5)+32;
     return C;
    }
}