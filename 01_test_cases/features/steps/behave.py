from behave import *


@given('we have triangle')
def step_impl(context):
    pass


@when('we implement a test')
def step_impl(context):
    assert True is not False


@then('behave will test it for us!')
def step_impl(context):
    assert context.failed is False


@given('input specific values')
def step_impl(context):
    for row in context.table:
        model.test_triangles(number=row['number'], department=row['department'])
