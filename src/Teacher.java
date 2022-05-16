public class Teacher {

    private int id;
    private String name; 
    private int salary;
    private static int salaryEarned; 
    
        public Teacher (int id, String name, int salary) { 

                this.id = id;
                this.name = name;
                this.salary = salary;
                this.salaryEarned = 0;
                

            }
//GET the information of the Teacher
        
        public int getId() {
            
            return id;
        }

        public String getName() {
            
            return name;
        }

        public int getSalary () {
            
            return salary;
        }
//SET the Salary of Teacher because it can change
        
        public void setSalary(int salary) { 
            
            this.salary=salary;

        }

    // adds to salary earned
    
        public static void receiveSalary (int salary) { 
            salaryEarned += salary;
            School.updateTotalMoneySpent(salary);


        }

        @Override
        public String toString() {
            return "Name of Teacher: " + name
                    +" Total salary earned so far $"
                    + salaryEarned;
        }
    }

