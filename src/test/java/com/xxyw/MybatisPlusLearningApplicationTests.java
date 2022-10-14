package com.xxyw;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xxyw.entity.User;
import com.xxyw.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class MybatisPlusLearningApplicationTests {

    @Autowired
    UserMapper userMapper;

    // 7 逻辑删除
    @Test
    void testDeleteLogic() {
        int rows = userMapper.deleteById(1580572615102894081L);
        System.out.println("rows = " + rows);
    }

    // 6 批量删除
    @Test
    void testDeleteBatch() {
        int rows = userMapper.deleteBatchIds(Arrays.asList(1, 2));
        System.out.println("rows = " + rows);
    }

    // 5 根据 ID 删除
    @Test
    void testDeleteById() {
        int rows = userMapper.deleteById(1580571387929198594L);
        System.out.println("rows = " + rows);
    }

    // 4. 分页查询
    @Test
    void testPage() {
        Page<User> page = new Page<>(1, 3);
        userMapper.selectPage(page, null);
        page.getRecords().forEach(System.out::println);
        System.out.println(page.getCurrent());
        System.out.println(page.getPages());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
    }

    // 3. 修改
    @Test
    void testUpdate() {
        // 根据 id 获取数据
        User user = userMapper.selectById(1580569140818305025L);
        // 修改
        user.setName("宫本武藏");
        // 调用实现接口
        userMapper.updateById(user);
    }

    // 2. 添加
    @Test
    void testAdd() {
        User user = new User();
        user.setName("嫦娥");
        user.setAge(18);
        user.setEmail("yjju@king.com");
        int rows = userMapper.insert(user);
        // 返回受影响的行数
        System.out.println("rows = " + rows);
        // 自动把主键赋值到对象中
        System.out.println("user = " + user);
    }

    // 1. 查询所有用户
    @Test
    void testFindAll() {
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}
