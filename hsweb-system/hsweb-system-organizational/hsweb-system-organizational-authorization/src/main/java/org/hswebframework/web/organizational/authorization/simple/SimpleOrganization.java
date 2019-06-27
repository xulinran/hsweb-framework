package org.hswebframework.web.organizational.authorization.simple;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hswebframework.web.organizational.authorization.District;
import org.hswebframework.web.organizational.authorization.Organization;

/**
 * @author zhouhao
 * @since 3.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SimpleOrganization implements Organization {
    private static final long serialVersionUID = 1_0;
    private String id;
    private String name;
    private String fullName;
    private String code;
    private District district;
}
