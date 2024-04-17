package model;

import java.sql.Date;

/**
 * The Actions class represents an entity that holds details about various actions taken in response to investigations, such as corrective, preventive, monitoring, training, product recalls, or process improvements. 
 * It encapsulates action-related information including its type, description, initiation and completion dates, status, impact level, the responsible department, expected outcomes, and the investigation it's linked to.
 */
public class Actions {
    
    private int id;
    private String actionType;
    private String description;
    private Date initiationDate;
    private Date completionDate;
    private String status;
    private String impactLevel;
    private String responsibleDepartment;
    private String expectedOutcome;
    private Investigations fkInvestigationId; // Uses Investigations class based on the foreign key relationship
    
    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getInitiationDate() {
        return initiationDate;
    }

    public void setInitiationDate(Date initiationDate) {
        this.initiationDate = initiationDate;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImpactLevel() {
        return impactLevel;
    }

    public void setImpactLevel(String impactLevel) {
        this.impactLevel = impactLevel;
    }

    public String getResponsibleDepartment() {
        return responsibleDepartment;
    }

    public void setResponsibleDepartment(String responsibleDepartment) {
        this.responsibleDepartment = responsibleDepartment;
    }

    public String getExpectedOutcome() {
        return expectedOutcome;
    }

    public void setExpectedOutcome(String expectedOutcome) {
        this.expectedOutcome = expectedOutcome;
    }

    public Investigations getFkInvestigationId() {
        return fkInvestigationId;
    }

    public void setFkInvestigationId(Investigations fkInvestigationId) {
        this.fkInvestigationId = fkInvestigationId;
    }

    // toString method for printing
    @Override
    public String toString() {
        return "Actions{" +
                "id=" + id +
                ", actionType='" + actionType + '\'' +
                ", description='" + description + '\'' +
                ", initiationDate=" + initiationDate +
                ", completionDate=" + completionDate +
                ", status='" + status + '\'' +
                ", impactLevel='" + impactLevel + '\'' +
                ", responsibleDepartment='" + responsibleDepartment + '\'' +
                ", expectedOutcome='" + expectedOutcome + '\'' +
                ", fkInvestigationId=" + (fkInvestigationId != null ? fkInvestigationId.getId() : "null") +
                '}';
    }
}