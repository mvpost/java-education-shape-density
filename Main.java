public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(10, 1);
        Cube cube = new Cube(10, 1);
        System.out.println("Плотность сферы: " + sphere.calculateDensity());
        System.out.println("Плотность куба: " + cube.calculateDensity());
    }
}
