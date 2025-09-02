package com.lesson.memo.model;

public enum Priority {
    HIGH("高", "high"),
    MEDIUM("中", "medium"),
    LOW("低", "low");

    private final String label;
    private final String cssClass;

    Priority(String label, String cssClass) {
        this.label = label;
        this.cssClass = cssClass;
    }

    public String getLabel() { return label; }
    public String getCssClass() { return cssClass; }
}
