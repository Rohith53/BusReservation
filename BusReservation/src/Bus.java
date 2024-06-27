public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    public Bus(int no, boolean ac, int cap) {
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void displaybusinfo(){
        System.out.println("Bus no : "+busNo+" AC : "+ac+" Total capacity : "+capacity);
    }
    
}
