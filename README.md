
# Fullstack Java/React Bootcamp

Employee leave management system


## Tools

- [Gitignore Generator](https://www.toptal.com/developers/gitignore/)
- [Readme Generator](https://readme.so/es)
- [Spring Initializr](https://start.spring.io/)

## Documentations

- [Java Roadmap](https://roadmap.sh/java)
- [Java Fundamentals](https://www.w3schools.com/java/default.asp)

## Project Roadmap
- [JIRA](https://adviters-bootcamp.atlassian.net/jira/software/projects/AB/boards/1/roadmap)


## API Reference

### Get all users

```http
  GET /api/users
```

### Get user by id

```http
  GET /api/users/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of user to fetch |

### Add user

```http
  POST /api/users
```

| Name | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `name`      | `string` | **Required**. Name of user |
| `lastname`      | `string` | **Required**. Lastname of user |
| `mail`      | `string` | **Required**. Mail of user |
| `phone`      | `number` | **Required**. Phone of user |
| `role`      | `string` | **Required**. Role of user |
| `profile_picture`      | `blob` | **Required**. Pprofile picture of user |
| `birth_date`      | `date` | **Required**. Birth date of user |

### Edit user

```http
  PUT /api/users/${id}
```

| Name | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `name`      | `string` | **Required**. Name of user |
| `lastname`      | `string` | **Required**. Lastname of user |
| `mail`      | `string` | **Required**. Mail of user |
| `phone`      | `number` | **Required**. Phone of user |
| `role`      | `string` | **Required**. Role of user |
| `profile_picture`      | `blob` | **Required**. Pprofile picture of user |
| `birth_date`      | `date` | **Required**. Birth date of user |

### Delete user by id

```http
  DELETE /api/users/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of user to fetch |