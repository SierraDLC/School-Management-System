//Class keeps track of students, fees, fee total and grade. 



public class Student {

    private int id;
    private String name;
    private int grade; 
    private int feesPaid;
    private int feesTotal;
 
        public Student(int id, String name,int grade) {
            this.feesPaid=0;
            this.feesTotal= 30000;
            this.id = id;
            this.name = name;
            this.grade = grade;

            
        }

        public void setGrade(int grade){
            this.grade = grade;

        }

        
    /**
     * this is the method for updating what fees were paid by the student
     * @param fees
     */   
        public void payFees(int fees) { 
            feesPaid +=fees;
            School.updateTotalMoneyEarned(feesPaid);


    }
    
    

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getGrade() {
            return grade;
        }

        public int getFeesPaid() {
            return feesPaid;
        }

       
        public int getFeesTotal() {
            return feesTotal;
        }
//return remaining fees
        public int getRemainingFees() {
            return feesTotal-feesPaid;
        }

        @Override
        public String toString() {
            return ("Student's name : " +name+ " Total fees paid so far $ " + feesPaid);
        
        }

     
}




