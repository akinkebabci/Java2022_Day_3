package entities;

import java.util.Arrays;

public class Kodlamaio {
    String id;
    String[] courseName ;

    String instructorName;
    String[] categoryName;
    int price;


    public  Kodlamaio(){

    }

    public Kodlamaio(String id, String[] courseName,int price, String instructorName, String[] categoryName) {
        this.id = id;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.categoryName = categoryName;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void getCourseName() {
        for (String courses:courseName) {
            System.out.println(courses);

        }

    }

    public void setCourseName(String[] courseName) throws Exception {
        String[] newCourse = courseName;

        long total = Arrays.stream(newCourse).distinct().count();
        long total2 = newCourse.length;
        if (total!=total2){
            throw new Exception("Aynı isimler Girilemez");
        }
        this.courseName = courseName;
    }


    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void  getCategoryName() {
        for (String categories:this.categoryName) {
            System.out.println(categories);
        }
    }

    public void setCategoryName(String[] categoryName) throws Exception {
        String[] newCategories = categoryName;

        long total = Arrays.stream(newCategories).distinct().count();
        long total2 = newCategories.length;
        if (total!=total2){
            throw new Exception("Aynı isimler Girilemez");
        }
        this.categoryName = categoryName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) throws Exception {
        if (price<=0){
            throw new Exception("Ücret Sıfdırdan Küçük olamamaz");
        }
        this.price = price;
    }
}
