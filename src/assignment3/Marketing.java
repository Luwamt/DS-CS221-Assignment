package assignment3;

public class Marketing {
    private  String  employee_name;
    private  String  product_name;
    private  int   sales_amount;

    public Marketing(String employee_name, String product_name, int sales_amount) {
        this.employee_name = employee_name;
        this.product_name = product_name;
        this.sales_amount = sales_amount;
    }

public int getSales_amount(){
        return sales_amount;
}

    @Override
    public String toString() {
        return "Employee_name='" + employee_name + '\'' +
                ", Product_name='" + product_name + '\'' +
                ", Sales_amount=" + sales_amount ;
    }
}
