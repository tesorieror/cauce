package tamm.diagram.expressions;

import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.options.ParsingOptions;

import tamm.diagram.part.TaskDiagramEditorPlugin;

/**
 * @generated
 */
public class TaskOCLFactory {

	/**
	 * @generated
	 */
	private final TaskAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected TaskOCLFactory() {
		this.expressions = new TaskAbstractExpression[46];
		this.expressionBodies = new String[] {
				"system.routeTasks->iterate(c; m:Integer=0 | m.max(c.id)).max(system.systemTasks->iterate(c; m:Integer=0 | m.max(c.id))).max(system.preConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.postConditions->iterate(c; m:Integer=0 | m.max(c.id)))).max(system.initialConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.finalConditions->iterate(c; m:Integer=0 | m.max(c.id)))) + 1", //$NON-NLS-1$
				"system.routeTasks->iterate(c; m:Integer=0 | m.max(c.id)).max(system.systemTasks->iterate(c; m:Integer=0 | m.max(c.id))).max(system.preConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.postConditions->iterate(c; m:Integer=0 | m.max(c.id)))).max(system.initialConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.finalConditions->iterate(c; m:Integer=0 | m.max(c.id)))) + 1", //$NON-NLS-1$
				"system.routeTasks->iterate(c; m:Integer=0 | m.max(c.id)).max(system.systemTasks->iterate(c; m:Integer=0 | m.max(c.id))).max(system.preConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.postConditions->iterate(c; m:Integer=0 | m.max(c.id)))).max(system.initialConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.finalConditions->iterate(c; m:Integer=0 | m.max(c.id)))) + 1", //$NON-NLS-1$
				"system.routeTasks->iterate(c; m:Integer=0 | m.max(c.id)).max(system.systemTasks->iterate(c; m:Integer=0 | m.max(c.id))).max(system.preConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.postConditions->iterate(c; m:Integer=0 | m.max(c.id)))).max(system.initialConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.finalConditions->iterate(c; m:Integer=0 | m.max(c.id)))) + 1", //$NON-NLS-1$
				"system.routeTasks->iterate(c; m:Integer=0 | m.max(c.id)).max(system.systemTasks->iterate(c; m:Integer=0 | m.max(c.id))).max(system.preConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.postConditions->iterate(c; m:Integer=0 | m.max(c.id)))).max(system.initialConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.finalConditions->iterate(c; m:Integer=0 | m.max(c.id)))) + 1", //$NON-NLS-1$
				"system.routeTasks->iterate(c; m:Integer=0 | m.max(c.id)).max(system.systemTasks->iterate(c; m:Integer=0 | m.max(c.id))).max(system.preConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.postConditions->iterate(c; m:Integer=0 | m.max(c.id)))).max(system.initialConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.finalConditions->iterate(c; m:Integer=0 | m.max(c.id)))) + 1", //$NON-NLS-1$
				"system.routeTasks->iterate(c; m:Integer=0 | m.max(c.id)).max(system.systemTasks->iterate(c; m:Integer=0 | m.max(c.id))).max(system.preConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.postConditions->iterate(c; m:Integer=0 | m.max(c.id)))).max(system.initialConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.finalConditions->iterate(c; m:Integer=0 | m.max(c.id)))) + 1", //$NON-NLS-1$
				"system.routeTasks->iterate(c; m:Integer=0 | m.max(c.id)).max(system.systemTasks->iterate(c; m:Integer=0 | m.max(c.id))).max(system.preConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.postConditions->iterate(c; m:Integer=0 | m.max(c.id)))).max(system.initialConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.finalConditions->iterate(c; m:Integer=0 | m.max(c.id)))) + 1", //$NON-NLS-1$
				"system.routeTasks->iterate(c; m:Integer=0 | m.max(c.id)).max(system.systemTasks->iterate(c; m:Integer=0 | m.max(c.id))).max(system.preConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.postConditions->iterate(c; m:Integer=0 | m.max(c.id)))).max(system.initialConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.finalConditions->iterate(c; m:Integer=0 | m.max(c.id)))) + 1", //$NON-NLS-1$
				"system.routeTasks->iterate(c; m:Integer=0 | m.max(c.id)).max(system.systemTasks->iterate(c; m:Integer=0 | m.max(c.id))).max(system.preConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.postConditions->iterate(c; m:Integer=0 | m.max(c.id)))).max(system.initialConditions->iterate(c; m:Integer=0 | m.max(c.id)).max(system.finalConditions->iterate(c; m:Integer=0 | m.max(c.id)))) + 1", //$NON-NLS-1$
				"ongoing->size()<1", //$NON-NLS-1$
				"ongoing->size()<1", //$NON-NLS-1$
				"incoming->size()<1", //$NON-NLS-1$
				"ongoing->size()<1", //$NON-NLS-1$
				"incoming->size()<1", //$NON-NLS-1$
				"incoming->size()<1", //$NON-NLS-1$
				"ongoing->size()<1", //$NON-NLS-1$
				"incoming->size()<1", //$NON-NLS-1$
				"ongoing->size()<1", //$NON-NLS-1$
				"incoming->size()<1", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"self>0", //$NON-NLS-1$
				"system.routeTasks->forAll(t| (t.id<>self.id)) and \r\nsystem.systemTasks->forAll(t|   (t.id<>self.id)) and \r\nsystem.preConditions->forAll(c| (c<>self) implies (c.id<>self.id)) and \r\nsystem.postConditions->forAll(c| (c.id<>self.id)) and \r\nsystem.initialConditions->forAll(c| (c.id<>self.id)) and \r\nsystem.finalConditions->forAll(c| (c.id<>self.id)) ", //$NON-NLS-1$
				"system.routeTasks->forAll(t| (t.id<>self.id)) and\r\nsystem.systemTasks->forAll(t|   (t.id<>self.id)) and\r\nsystem.preConditions->forAll(c| (c<>self) implies (c.id<>self.id)) and\r\nsystem.postConditions->forAll(c| (c<>self) implies (c.id<>self.id)) and\r\nsystem.initialConditions->forAll(c| (c.id<>self.id)) and\r\nsystem.finalConditions->forAll(c| (c.id<>self.id))", //$NON-NLS-1$
				"system.routeTasks->forAll(t| (t.id<>self.id)) and\r\nsystem.systemTasks->forAll(t|   (t.id<>self.id)) and\r\nsystem.preConditions->forAll(c| (c<>self) implies (c.id<>self.id)) and\r\nsystem.postConditions->forAll(c| (c.id<>self.id)) and\r\nsystem.initialConditions->forAll(c| (c<>self) implies (c.id<>self.id)) and\r\nsystem.finalConditions->forAll(c| (c.id<>self.id))", //$NON-NLS-1$
				"system.routeTasks->forAll(t| (t.id<>self.id)) and\r\nsystem.systemTasks->forAll(t|   (t.id<>self.id)) and\r\nsystem.preConditions->forAll(c| (c.id<>self.id)) and\r\nsystem.postConditions->forAll(c| (c.id<>self.id)) and\r\nsystem.initialConditions->forAll(c| (c<>self) implies (c.id<>self.id)) and\r\nsystem.finalConditions->forAll(c| (c<>self) implies (c.id<>self.id))", //$NON-NLS-1$
				"self>0", //$NON-NLS-1$
				"not incoming.oclIsUndefined()", //$NON-NLS-1$
				"not ongoing.oclIsUndefined()", //$NON-NLS-1$
				"incoming->size()>0", //$NON-NLS-1$
				"not ongoing.oclIsUndefined()", //$NON-NLS-1$
				"ongoing->size()>0", //$NON-NLS-1$
				"not incoming.oclIsUndefined()", //$NON-NLS-1$
				"not incoming.oclIsUndefined()", //$NON-NLS-1$
				"not ongoing.oclIsUndefined()", //$NON-NLS-1$
				"self.size()>0", //$NON-NLS-1$
				"system.systemTasks->forAll(t | (t.oclIsTypeOf(SimpleTask) and t<>self) implies (self.oclAsType(SimpleTask).name<>t.oclAsType(SimpleTask).name))", //$NON-NLS-1$
				"system.routeTasks->forAll(t| (t.id<>self.id)) and\r\nsystem.systemTasks->forAll(t|  (t<>self) implies (t.id<>self.id)) and\r\nsystem.preConditions->forAll(c| (c.id<>self.id)) and\r\nsystem.postConditions->forAll(c| (c.id<>self.id)) and\r\nsystem.initialConditions->forAll(c| (c.id<>self.id)) and\r\nsystem.finalConditions->forAll(c| (c.id<>self.id))", //$NON-NLS-1$
				"system.routeTasks->forAll(t| (t<>self) implies (t.id<>self.id)) and\r\nsystem.systemTasks->forAll(t| (t.id<>self.id)) and\r\nsystem.preConditions->forAll(c| (c.id<>self.id)) and\r\nsystem.postConditions->forAll(c| (c.id<>self.id)) and\r\nsystem.initialConditions->forAll(c| (c.id<>self.id)) and\r\nsystem.finalConditions->forAll(c| (c.id<>self.id))", //$NON-NLS-1$
				"not ongoing->oclIsUndefined()", //$NON-NLS-1$
				"not incoming->oclIsUndefined()", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static TaskOCLFactory getInstance() {
		TaskOCLFactory instance = TaskDiagramEditorPlugin.getInstance()
				.getTaskOCLFactory();
		if (instance == null) {
			TaskDiagramEditorPlugin.getInstance().setTaskOCLFactory(
					instance = new TaskOCLFactory());
		}
		return instance;
	}

	/**
	 * @generated
	 */
	public static String getExpressionBody(int index) {
		return getInstance().expressionBodies[index];
	}

	/**
	 * @generated
	 */
	public static TaskAbstractExpression getExpression(int index,
			EClassifier context, Map<String, EClassifier> environment) {
		TaskOCLFactory cached = getInstance();
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			cached.expressions[index] = getExpression(
					cached.expressionBodies[index],
					context,
					environment == null ? Collections
							.<String, EClassifier> emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	 * This is factory method, callers are responsible to keep reference to the return value if they want to reuse parsed expression
	 * @generated
	 */
	public static TaskAbstractExpression getExpression(String body,
			EClassifier context, Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static TaskAbstractExpression getExpression(String body,
			EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression extends TaskAbstractExpression {

		/**
		 * @generated
		 */
		private final org.eclipse.ocl.ecore.OCL oclInstance;

		/**
		 * @generated
		 */
		private OCLExpression oclExpression;

		/**
		 * @generated
		 */
		public Expression(String body, EClassifier context,
				Map<String, EClassifier> environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
			Helper oclHelper = oclInstance.createOCLHelper();
			oclHelper.setContext(context());
			try {
				oclExpression = oclHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (ParserException e) {
				setStatus(IStatus.ERROR, e.getMessage(), e);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (oclExpression == null) {
				return null;
			}
			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance
					.getEvaluationEnvironment();
			// initialize environment
			for (Object nextKey : env.keySet()) {
				evalEnv.replace((String) nextKey, env.get(nextKey));
			}
			try {
				Object result = oclInstance.evaluate(context, oclExpression);
				return oclInstance.isInvalid(result) ? null : result;
			} finally {
				evalEnv.clear();
				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}
		}

		/**
		 * @generated
		 */
		private static void initCustomEnv(
				Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv,
				Map<String, EClassifier> environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv,
					ParsingOptions.implicitRootClass(ecoreEnv),
					EcorePackage.eINSTANCE.getEObject());
			for (String varName : environment.keySet()) {
				EClassifier varType = environment.get(varName);
				ecoreEnv.addElement(varName,
						createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		 * @generated
		 */
		private static Variable createVar(
				Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv,
				String name, EClassifier type) {
			Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}
}
