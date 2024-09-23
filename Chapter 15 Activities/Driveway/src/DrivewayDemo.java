import java.util.Scanner;

public class DrivewayDemo
{
    public static void main(String[] args)
    {
        Driveway testDriveway = new Driveway();
        Scanner in = new Scanner(System.in);
        System.out.println("Positive integers add cars to the driveway");
        System.out.println("Negative license numbers remove cars.");
        System.out.println("0 stops the simulation.");

        int licensePlate = -1;
        while (in.hasNextInt() && licensePlate != 0)
        {
            licensePlate = in.nextInt();
            if (licensePlate > 0)
            {
                testDriveway.add(licensePlate);
            }
            else if (licensePlate < 0)
            {
                testDriveway.remove(-licensePlate);
            }
            else
            {
                testDriveway.print();
            }
        }
        in.close();
    }
}
