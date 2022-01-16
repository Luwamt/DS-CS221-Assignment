package assignment5;

public class Student implements Comparable<Student> {
   private int sid;
    private String sname;
    private int score;

    public Student(int sid, String sname, int score) {
        this.sid = sid;
        this.sname = sname;
        this.score = score;
    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public int getScore() {
        return score;
    }
     @Override
    public int compareTo(Student o) {
        return (score - o.score);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Student std = (Student) o;
        return sid == std.getSid() && sname.equalsIgnoreCase(std.sname) && score == std.score;
    }
    @Override
    public String toString() {
        return "sid: " + sid +
                ", sname: '" + sname + '\'' +
                ", score: " + score ;
    }


}
