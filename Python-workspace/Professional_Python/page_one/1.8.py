class Task(object):
    ''' a tricial task class. task classes hava a 'run' method , which runs
        the task'''
    def run(self,*args,**kwargs):
        raise  NotImplementedError('Subclasses must implement run.')
    def identify(self):
        return 'i am a task'
def task(decorated):
    '''sdasdasd'''
    class TaskSubclass(Task):
        def run(self,*args,**kwargs):
            return decorated(*args,**kwargs)
    return TaskSubclass()

@task
def foo():
    return 2+2
f=foo()
print(f)
print(f.run())
print(f.identify())

