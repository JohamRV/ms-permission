package pe.edu.pucp.mspermission.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.pucp.mspermission.dao.PermissionDao;
import pe.edu.pucp.mspermission.entity.Permission;
import pe.edu.pucp.mspermission.repository.PermissionRepository;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    PermissionRepository permissionRepository;

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createPermission(@RequestBody PermissionDao permissionDao){
        Map<String, String> response = new HashMap<>();
        Permission permission = permissionDao.getPermission();
        permissionRepository.save(permission);
        response.put("status", HttpStatus.CREATED.getReasonPhrase());
        response.put("message", "Permission created successfully.");
        return new ResponseEntity(response, HttpStatus.CREATED);
    }



    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity listPermissionByRole(){
        return new ResponseEntity(permissionRepository.findAll(), HttpStatus.OK);
    }

}
