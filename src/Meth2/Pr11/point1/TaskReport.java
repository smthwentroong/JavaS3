package Meth2.Pr11.point1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TaskReport {

    private String name;
    private Date recieve;
    private  Date handOver;

    public TaskReport(String name, Date toTask) {
        this.name = name;
        this.recieve = toTask;
    }

    public String getName() {
        return name;
    }

    public void setName(String stDeveloperName) {
        this.name = stDeveloperName;
    }

    public Date getStart() {
        return recieve;
    }

    public void setStart(Date toTask) {
        this.recieve = toTask;
    }

    public Date getDeadline() {
        return handOver;
    }

    public void setEndDate(Date toReport) {
        this.handOver = toReport;
    }


    @Override
    public String toString(){
        return "Developer: "
                + name
                + " recieved task: "+ new SimpleDateFormat("E yyyy - MM - dd" ).format(recieve)
                + " handed over: "+ new SimpleDateFormat("E yyyy - MM - dd" ).format(handOver)
                + " work time: " + (handOver.getTime() - recieve.getTime())/(1000 * 3600)
                + " hours";
    }
}
