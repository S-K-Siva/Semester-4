class Student{
    String Name;
    int Mark;
}
public class arr_of_classobj {
    public static void main(String a[]){
        Student objects[] = new Student[3];
        for(int i = 0;i<objects.length;i++){
            objects[i] = new Student();
            objects[i].Name = "Person" + i;
            objects[i].Mark = i*10 + i;
        }

        for(int i = 0;i<objects.length;i++){
            System.out.println(objects[i].Name + ":" + objects[i].Mark);
        }
    }
}
