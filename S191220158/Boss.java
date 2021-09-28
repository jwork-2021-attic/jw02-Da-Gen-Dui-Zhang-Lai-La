package S191220158;

public class Boss {
    private static Boss theGeezer;

    public static Boss getTheGeezer() {
        if (theGeezer == null) {
            theGeezer = new Boss();
        }
        return theGeezer;
    }

    private Boss() {

    }

    private Sorter sorter;

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public String lineUp(Line line,Monster[]monster) {

        String log = new String();

        if (sorter == null) {
            return null;
        }

        Linable[] linables = line.toArray();
        int[] ranks = new int[linables.length];

        for (int i = 0; i < linables.length; i++) {
            ranks[i] =Integer.parseInt(linables[i].getValue());
        }

        sorter.load(ranks);
        sorter.sort();

        String[] sortSteps = this.parsePlan(sorter.getPlan());
       
        for (String step : sortSteps) {
            this.execute(step,monster);
            System.out.println(line.toString());
            log += line.toString();
            log += "\n[frame]\n";
        }

        return log;

    }

    private String[] parsePlan(String plan) {
        return plan.split("\n");
    }
    private void execute(String step,Monster[] linables) {
        String[] couple = step.split("<->");
        int left=-1,right=-1;
        for (int i = 0; i < linables.length; i++){
            if(Integer.parseInt(linables[i].getValue())==Integer.parseInt(couple[0]))
            left=i;
            else if(Integer.parseInt(linables[i].getValue())==Integer.parseInt(couple[1]))
            right=i;
        }
        if(left!=-1&&right!=-1)
        linables[left].swapPosition(linables[right]);
    }
}