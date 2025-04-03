class Math extends Subject {
    public Math() {
        super("Математика", "Иванов А.А.");
    }

    @Override
    public void study() {
        System.out.printf("[%s] Решаем уравнения и теоремы. Преподаватель: %s\n\n",
                getSubjectName(), getTeacher());
    }
}

class History extends Subject {
    public History() {
        super("История", "Петрова И.С.");
    }

    @Override
    public void study() {
        System.out.printf("[%s] Анализируем исторические документы. Преподаватель: %s\n\n",
                getSubjectName(), getTeacher());
    }
}

class Science extends Subject {
    public Science() {
        super("Естествознание", "Сидоров В.М.");
    }

    @Override
    public void study() {
        System.out.printf("[%s] Проводим лабораторные эксперименты. Преподаватель: %s\n\n",
                getSubjectName(), getTeacher());
    }
}