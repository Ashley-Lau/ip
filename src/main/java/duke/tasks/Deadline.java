package duke.tasks;

import java.time.LocalDateTime;

import duke.Time;

/**
 * @author Damith C. Rajapakse
 * Reused from https://nus-cs2103-ay2021s1.github.io/website/schedule/week2/project.html with modifications
 *
 * Class to initiate a deadline task.
 */
public class Deadline extends Task {
    private LocalDateTime by;

    /**
     * Constructor for Deadline.
     */
    public Deadline(String description, LocalDateTime by) {
        super(description);
        this.by = by;
    }

    /**
     * Another Constructor for deadline with another parameter.
     */
    public Deadline(String description, boolean isDone, LocalDateTime by) {
        super(description, isDone);
        this.by = by;
    }

    public String getBy() {
        return Time.convertTimeToSave(by);
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + Time.toString(by) + ")";
    }
}
