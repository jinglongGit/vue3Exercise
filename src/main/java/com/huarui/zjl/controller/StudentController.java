package com.huarui.zjl.controller;

import com.huarui.zjl.entity.Student;
import com.huarui.zjl.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import javax.annotation.Resource;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2023-02-09 19:27:08
 */
@RestController
@RequestMapping("student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Student> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.studentService.queryById(id));
    }

    @GetMapping()
    public ResponseEntity<List<Student>> queryAll() {
        return ResponseEntity.ok(this.studentService.queryAll());
    }

    /**
     * 新增数据
     *
     * @param student 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Student> add(@RequestBody Student student) {
        System.out.println("1111111111");
        System.out.println("1111111111");
        System.out.println("1111111111");
        return ResponseEntity.ok(this.studentService.insert(student));
    }

    /**
     * 编辑数据
     *
     * @param student 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Student> edit(@RequestBody Student student) {
        return ResponseEntity.ok(this.studentService.update(student));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable Integer id) {
        return ResponseEntity.ok(this.studentService.deleteById(id));
    }

}

