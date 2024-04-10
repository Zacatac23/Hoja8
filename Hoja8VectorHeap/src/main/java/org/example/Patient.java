package org.example;

class Patient implements Comparable<Patient> {
    private final String name;
    private final String symptom;
    private final char priority;

    public Patient(String name, String symptom, char priority) {
        this.name = name;
        this.symptom = symptom;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public String getSymptom() {
        return symptom;
    }

    public char getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Patient other) {
        return Character.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Nombre: " + name + ", Síntoma: " + symptom + ", Prioridad: " + priority;
    }
}
