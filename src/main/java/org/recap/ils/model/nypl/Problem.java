package org.recap.ils.model.nypl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by rajeshbabuk on 9/12/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ProblemType",
        "ProblemDetail"
})
@Getter
@Setter
public class Problem {
    @JsonProperty("ProblemType")
    private String problemType;
    @JsonProperty("ProblemDetail")
    private String problemDetail;
}
