import java.util.ArrayList;

public class IntegerSet {
    private ArrayList<Integer> num ;    
    
    //Rep Invariant (RI):
    // - num ต้องไม่ประกอบด้วยตัวเลขที่ซ้ำกัน
    // - Integer ใน num ต้องเรียงจากน้อยไปมาก
    // - num ต้องไม่มี null
    
    //Abstraction Function (AF):
    //- AF(num) = เซตของ Integer ทั้งหมดอยู่ใน ArrayList num


    public IntegerSet(){
        num = new ArrayList<>();
        checkRep();
    }


    /**
     * เพิ่มตัวเลขเข้าเซต
     * @param integer ตัวเลขที่ต้องการเพิ่ม
     */
    private void checkRep(){
        for (int i = 0; i < num.size() - 1; i++) {
            if (num.get(i) >= num.get(i+1)) {
                throw new RuntimeException("Rep invariant violated!");
            }   
        }     
    }

    /**
     * เพิ่มตัวเลขเข้าเซต
     * @param integer ตัวเลขที่ต้องการเพิ่ม
     */
    public void add(Integer x) {
        if (!num.contains(x) && num != null && x != null) {
            if (num.size() == 0) {
                num.add(x);
            }else{
                for(int i=0; i<num.size(); i++){
                    if (x < num.get(0)) {
                        num.add(0, x); break;
                    }else if (i == num.size()-1) {
                        num.add(x); break;
                    }else if (num.get(i) < x && x < num.get(i+1)) {
                        num.add(i+1, x); break;
                    }
                }
            }
        }
    }


    public String toString(){
        return num.toString();
    }


}

