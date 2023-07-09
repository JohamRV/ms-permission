package pe.edu.pucp.mspermission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pucp.mspermission.entity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Integer> {
}
