# Payment Services Gateway temporary git project (till GAPI infrastructure is shared)

## How to run project locally

1) Clone repository

2) Open project (do not forget to select Use Default Gradle wrapper. Gradle v4.0 is used in project, while default Idea wrapper is < 4)

3) Install Docker
https://docs.docker.com/engine/installation/linux/docker-ce/ubuntu/#install-using-the-repository
Xenial 16.04 and newer

4) Install kitematic (UI tool to ease work with Docker). Download .zip for Ubuntu. Open it and click install button at the end.
https://github.com/docker/kitematic/releases/

5) Run kitematic from console with SUDO
```
> sudo kitematic
```

6) After kitematic is opened -> click Skip For Now on first page (asking for registration).

7) In search field type "postgres". The top most should be Official Postgress Image. Just click "Create" on that tile.
- After image is downloaded it will be automatically started and you will see logs from inside container (like DB is up and running)
Go to "Settings".
- "General" tab you have to add key-value pairs according to our application.properties configuration:
POSTGRES_PASSWORD=mysecretpassword
- Click Save.
- "Hostname/Ports" tab: both Docker port and Publish IP port should be same: 5432
- Click Save.
- "Volumes" tab. If you do not want DB is always cleaned up (as Docker will not save state by default), you need to map Docker Folder to your Local Folder on Ubuntu.
Create sofme folder click Change and point to it.
- Click "Restart" to apply DB password.

8) Go to IntelijIdea and in Gradle view click to run task "BootRun" (Tasks-> Application-> BootRun)

As DB is up and running, it should be started without problems.
When its up you may follow link with swagger ui: https://localhost:8087/swagger-ui.html