package com.projecttrackerapi.constants;

import com.projecttrackerapi.dtos.ProjectDto;
import com.projecttrackerapi.dtos.ProjectTaskDto;

import java.util.Date;
import java.util.List;

public final class Constants {
    // Project Statuses
    public static final String TODO_STATUS = "TO_DO";

    // Rest Error Messages
    public static final String REST_BAD_REQUEST = "400: Bad Request";
    public static final String REST_FORBIDDEN = "403: Forbidden";
    public static final String REST_NOT_FOUND = "404: Not Found";
    public static final String REST_CONFLICT = "409: Conflict";
    public static final String REST_MEDIA_TYPE_NOT_SUPPORTED = "415: Media Type Not Supported";
    public static final String REST_INTERNAL_SERVER_ERROR = "500: Internal Server Error";
    public static final String REST_SERVICE_UNAVAILABLE = "503: Service Unavailable";

    // Detailed Error Messages
    public static final String INVALID_JSON = "Invalid JSON sent in request.";
    public static final String INVALID_PROJECT_ID_SENT_IN_BODY = "Invalid projectId sent in request body.";
    public static final String INVALID_ID_SENT_IN_PATH = "Invalid id sent in request path.";
    public static final String PROJECT_MUST_HAVE_NAME = "The project must have a name. ";
    public static final String PROJECT_MUST_HAVE_DESCRIPTION = "The project must have a description. ";
    public static final String PROJECT_MUST_HAVE_START_DATE = "The project must have a start date. ";
    public static final String PROJECT_NOT_FOUND = "The project was not found.";
    public static final String PROJECT_HAS_NO_TASKS = "The project does not have any tasks.";
    public static final String PROJECT_FOR_TASK_NOT_FOUND = "The project for this task was not found.";
    public static final String PROJECT_TASK_NOT_FOUND = "The project task was not found.";
    public static final String PROJECT_TASK_MUST_HAVE_PROJECT_ID = "The project task must have a project id. ";
    public static final String PROJECT_TASK_MUST_HAVE_NAME = "The project task must have a name. ";
    public static final String PROJECT_TASK_MUST_HAVE_DESCRIPTION = "The project task must have a description. ";
    public static final String PROJECT_TASK_MUST_HAVE_ACCEPTANCE_CRITERIA = "The project task must have acceptance criteria. ";

    // Special Case Error Flags
    public static final String CANNOT_DESERIALIZE_UUID_ERROR_MESSAGE = "UUID has to be represented by standard 36-char representation";
    public static final String INVALID_UUID_STRING = "Invalid UUID string:";

    // Log Messages
    public static String saveOrUpdateProjectMessage(ProjectDto project) {
        return "\nTime: " + new Date().toString() + ", \nSaved/Updated Project: " + project.toString();
    }

    public static String deleteProjectMessage(ProjectDto deletedProject, List<ProjectTaskDto> deletedProjectTasks) {
        return "\nTime: " + new Date().toString() + ", \nDeleted Project: " + deletedProject.toString() + ", and Project Tasks: " + deletedProjectTasks.toString();
    }

    public static String saveOrUpdateProjectTaskMessage(ProjectTaskDto projectTask) {
        return "\nTime: " + new Date().toString() + ", \nSaved/Updated Project Task: " + projectTask.toString();
    }

    public static String deleteProjectTaskMessage(ProjectTaskDto projectTask) {
        return "\nTime: " + new Date().toString() + ", \nDeleted Project Task: " + projectTask.toString();
    }
}
