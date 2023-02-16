package com.huarui.zjl.service.impl;

import com.huarui.zjl.entity.Student;
import com.huarui.zjl.mapper.StudentMapper;
import com.huarui.zjl.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import javax.annotation.Resource;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2023-02-09 19:27:09
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentmapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Student queryById(Integer id) {
        return this.studentmapper.queryById(id);
    }

    @Override
    public List<Student> queryAll() {
        return this.studentmapper.queryAll();
    }

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student insert(Student student) {
        this.studentmapper.insert(student);
        return student;
    }

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student update(Student student) {
        this.studentmapper.update(student);
        return this.queryById(student.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.studentmapper.deleteById(id) > 0;
    }
}
