package org.example;

// This Java code defines a record class named `Patient` with three components: `name`, `symptom`, and
// `priority`. The `Patient` class implements the `Comparable` interface with itself as the type
// parameter, allowing instances of `Patient` to be compared based on their `priority` attribute.
record Patient(String name, String symptom, char priority) implements Comparable<Patient> {

    @Override
    public int compareTo(Patient other) {
        return Character.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Nombre: " + name + ", Síntoma: " + symptom + ", Prioridad: " + priority;
    }
}
