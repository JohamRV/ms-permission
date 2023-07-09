package pe.edu.pucp.mspermission.dao;

import lombok.Data;
import org.springframework.stereotype.Component;
import pe.edu.pucp.mspermission.entity.Permission;

@Data
@Component
public class PermissionDao {
    Permission permission;
}
