package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * The `EmergencyQueue` class implements a priority queue of `Patient` objects using a `VectorHeap`
 * data structure.
 */
public class Main {
    // The `public static void main(String[] args)` method in the provided Java code is the entry point
    // of the program. Here's a breakdown of what it does:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del archivo de pacientes (por ejemplo, pacientes.txt): ");
        String fileName = scanner.nextLine();

        EmergencyQueue patientQueue = new EmergencyQueue();

        // Leer datos de pacientes del archivo ingresado por el usuario
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    String symptom = parts[1].trim();
                    char priority = parts[2].trim().charAt(0);
                    patientQueue.add(new Patient(name, symptom, priority));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }

        // Atender pacientes en orden de prioridad
        while (!patientQueue.isEmpty()) {
            Patient nextPatient = patientQueue.remove();
            System.out.println(nextPatient);
        }
    }
}
