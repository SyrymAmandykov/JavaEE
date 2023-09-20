package app.servlets.sprint.domain;

import java.time.LocalDate;

public class Tasks {

    private Long id;
    private String name;
    private String description;
    private LocalDate deadlineDate;

    public Tasks(Long id, String name, String description, LocalDate deadlineDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadlineDate = deadlineDate;
    }

    @Override
        public int hashCode() {
            return id.hashCode();
        }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Tasks task = (Tasks) obj;

        return id.equals(task.id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(LocalDate deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

}
