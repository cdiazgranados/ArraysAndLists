import java.util.ArrayList;

public class AverageDoubleLists {

    // write out these too
    public Double count(ArrayList<Double> aa) {
        double count = aa.size();
        return count; //convert to double
    }
    public Double sum(ArrayList<Double> aa) {
        double sum = 0;

        for (int i = 0; i < aa.size(); i++) {
            sum += aa.get(i);
        }

        return Math.round(sum * 10.0) / 10.0;
    }
    public Double average(ArrayList<Double> aa) {
        return Math.round((sum(aa) / count(aa)) * 10.0) /10.0;
    }

}
