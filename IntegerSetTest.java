public class IntegerSetTest {
    
    public static void main(String[] args) {
        System.out.println("\nprogram start");
        int passed = 0,failed =0;

        // Test 1: การสร้าง, เพิ่มข้อมูล, และการเรียงลำดับ
        System.out.println("\n--- Testing add() and sorting ---");
        IntegerSet set1 = new IntegerSet();
        set1.add(3);set1.add(1);set1.add(2);set1.add(6);set1.add(5);
   
        String expected1 = "[1, 2, 3, 5, 6]";
        if (set1.toString().equals(expected1)) {
            System.out.println("PASSED: Add and sort works correctly."+ set1.toString());
            passed++;
        } else {    
            System.out.println("FAILED: Expected " + expected1 + " but got " + set1.toString());
            failed++;
        }   

        
        // Test 2: เพิ่มข้อมูล เพิ่มตัวเลขซ้ำกัน
        IntegerSet set2 = new IntegerSet();
        set2.add(2);set2.add(3);set2.add(3);set2.add(0);set2.add(22);
   
        String expected2 = "[0, 2, 3, 22]";
        if (set2.toString().equals(expected2)) {
            System.out.println("PASSED: Add and sort works correctly."+ set2.toString());
            passed++;
        } else {    
            System.out.println("FAILED: Expected " + expected2 + " but got " + set2.toString());
            failed++;
        }  


                // --- สรุปผล ---
        System.out.println("\n--------------------");
        System.out.println("--- Test Summary ---");
        System.out.println("Passed: " + passed + ", Failed: " + failed);
        if (failed == 0) {
            System.out.println("ALL tests passed!");
        } else {
            System.out.println("Some tests failed.");
        }
    }
}
